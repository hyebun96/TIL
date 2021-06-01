# ConcurrentHashMap

### Thread-Safe

- 동기화(Synchronize)라고 표현하기도 하며 어떠한 Class의 인스턴스가 여러개 Thread에서 동시 참조되고 해당 객체의 Operation이 발생해도 정합성을 유지해줄 때 보통 우리는 Thread-Safe 하다라고 표현
- @ThreadSafe 어노테이션을 이용해 해당 Class가 Thread-Safe함을 표시하기도 함
- 멀티 Thread 환경에서 필수적인 요소

### HashMap과 HashTable의 차이

- Null 허용 여부
- 동기화 여부(동기화 란, 한 자원에 대해서 동시에 접근하는 것을 제한하는 방식)
- Interator / Enumeration

### HashMap

- 키에 대한 해시 값을 사용하여 값을 저장하고 조회하며, 키-값 쌍의 개수에 따라 동적으로 크기가 증가하는 associate array라고 할 수 있음
- Java Collection Framework에 속한 구현체 클래스
- Thread-Safe하지 못한 클래스 ⇒ Thread에 안전하지 않음
- MultiThread 환경에서 사용하려면 꼭 동기화 처리가 필요
- Collections.synchronizedMap등을 이용하여 동기화 처리후 사용

### HashTable

- get(), put() 메서드를 확인해 보면 synchronized하게 구현되어 있음
- 동기화 처리가 되어 있기 때문에 MultiThread환경에서도 안전하게 사용 가능
- 메소드 호출 전에 쓰레드 환경에서 쓰레드 간에 Synchronized Lock을 걸기 때문에 데이터의 무결성을 보장

### ConcurrentHashMap

- Java 1.5부터 사용가능한 ConcurrentUril인터페이스에서 제공하는 클래스
- CuncurrnetHashMap은 SynchronizedMap으로 Wrapping된 HashMap이나 HashTable보다 더 빠른 속도를 보이면서도 쓰레드 간의 동기화를 보장
- ConcurrentHashMap은 동기화 시, Map전체에 동기화 락을 걸지 않고, Map을 여러 조각으로 쪼개 일부만 락을 거는 형태로 구현되어 있기 때문에 가능
- 이러한 이유로, 멀티 쓰레드 환경에서도 쓰레드 간의 경쟁이 심한 경우, 더 효율적인 성능을 보임
- 검색과 갱신 전체에 걸쳐 Thread-Safe함을 보장하면서도 높은 성능을 보장
- HashMap처럼 기본적으로 Hashtable과 동일한 Spec를 제공
- 모든 작업이 Thread-Safe임에도 불구하고 검색작업에는 Lock이 수반되지 않으며, 전체 테이블을 잠궈야하는 액션도 없음
- ConcurrentHashMap의 검색작업은 Lock이 이루어지지 않으며
- 순서가 없고 들어오는 즉시 처리해서 속도가 빠르다
- 중복을 허용하지 않고 null을 허용하지 않음
