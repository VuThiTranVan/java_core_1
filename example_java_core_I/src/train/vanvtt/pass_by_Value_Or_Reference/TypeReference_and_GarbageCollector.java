package train.vanvtt.pass_by_Value_Or_Reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * 
 * @author FRAMGIA\vu.thi.tran.van
 * https://techmaster.vn/posts/34067/kieu-tham-chieu-trong-java
 * 
 * (*) Cache
 * Cache là một class - nó sẽ chứa dữ liệu - bộ nhớ tạm - và được giải phòng bỏi Garbage Collertor_bộ dọn rác
 * 
 * Yêu cầu của chương trình:
 * Chúng ta cần lấy dữ liệu của 1 table trong Database
 * Nếu chúng ta call liên tục đến DB sẽ khiến cho áp lực về hiệu năng của ứng dụng
 * 
 * Flow của chương trình:
 *     ứng dụng sẽ check phần cache xem dữ liệu có nằm ở đây không, nếu không, nó sẽ check database và đặt phần entry của dữ liệu vào cache.
 *     Từ đó, ứng dụng không cần gọi trực tiếp cơ sở dữ liệu mà chỉ cần truy cập vào cache là có thể lấy được dữ liệu cần thiết.
 *     
 * Problem từ Flow
 *     Nếu như table có quá nhiều record -> thì phần Map được tạo bỏ Cache sẽ càng lớn
 *     => Thay vì muốn cải thiện hiệu năng khi phải chọc vào DB quá nhiều lần, thì nó lại khiến cho bộ nhớ của hệ thống bị rút cạn
 *     
 *    
 * (*)(*) Giải pháp lý tưởng cho 2 vấn đề trên:
 *     Nếu như chúng ta có thể tạo cache "động".
 *         tức là cache này có thể tự động thay đổi kích thước theo nhu cầu của data.
 *         Để làm được thì chúng ta cần đến một kỹ thuật đặc biệt mà chỉ có Java, nhằm mục đích xóa các entry nằm trong cache quá lâu nhưng không được dùng đến - nếu được refernce thì ko xóa dc đâu nhé (hihi)
 *             Gói [java.lang.ref]
 *             
 * Trong gói java.lang.ref có hỗ trợ 4 kiểu reference(tham chiếu)
 *     - Strong reference
 *     - Soft Reference
 *     - Weak reference
 *     - Phantom reference - tạm dịch: tham chiếu MA
 */
public class TypeReference_and_GarbageCollector {
		/**
		 * Strong reference 
		 *     Có thể tạo object và gán object đó cho một tham chiếu.
		 *     Chừng nào một object có tham chiếu mạnh, nó sẽ không bị thu hồi bởi bộ GC - Garbage Collector
		 */
			// String  str = new String("hello world!");
		
		/**
		 *  WeakHashMap 
		 *     Nếu một Object không có Strong reference nhưng có Soft Reference, nó có thể bị thu hồi bởi GC khi cần thiết (khi thiếu bộ nhớ).
		 *     Để lấy một object đang có Soft Reference, ta có thể invoke method get().
		 *     Sau khi invoke method get(), nếu object đã bị thu hồi, get() sẽ trả về null.
		 */
		
		/**
		 * Weak reference
		 *     Một object không có Strong reference nhưng lại có Weak reference thì trong lần chạy tiếp theo của GC,
		 *       object này sẽ bị thu hồi cho dù bộ nhớ không bị thiếu.
		 */
		
		/**
		 * Phantom reference 
		 *      Đây là một kiểu tham chiếu đặc biệt, nó ám chỉ rằng object này đã "hoàn thành nhiệm vụ" và có thể được GC thu hồi.
		 *      Nếu một object không có bất kỳ loại tham chiếu nào trong 3 kiểu Strong - Soft - Weak thì rất có thể nó có Phantom reference. 
		 * 
		 */
	
	public static class ReferenceExample {
		private String status = "Hi I am active";

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "ReferenceExample [status=" + status + "]";
		}

		public void strongReference() {
			ReferenceExample ex = new ReferenceExample();
			System.out.println(ex);
		}

		public void softReference() {
			SoftReference<ReferenceExample> ex = new SoftReference<ReferenceExample>(getRefrence());
			// khi chúng ta tạo ra Soft Reference, nếu không gian bộ nhớ còn thoải mái thì object có Soft Reference chưa bị GC thu hồi.
			System.out.println("Soft refrence :: " + ex.get());
		}

		/*
		 * Với Weak và Phantom Reference, chúng đều bị GC thu hồi.
		 */
		public void weakReference() {
			int counter = 0;
			WeakReference<ReferenceExample> ex = new WeakReference<ReferenceExample>(getRefrence());
			while (ex.get() != null) {
				counter++;
				System.gc();
				System.out.println("Weak reference deleted  after:: " + counter + ex.get());
			}
		}

		public void phantomReference() throws InterruptedException {
			final ReferenceQueue queue = new ReferenceQueue();
			PhantomReference<ReferenceExample> ex = new PhantomReference<ReferenceExample>(getRefrence(), queue);
			System.gc();
			queue.remove();
			System.out.println("Phantom reference deleted  after");
		}
		
		public static void main(String[] args) {
			ReferenceExample ex = new ReferenceExample();
			ex.strongReference();
			ex.softReference();
			ex.weakReference();
			try {
				ex.phantomReference();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		private ReferenceExample getRefrence() {
			return new ReferenceExample();
		}

	}
}
