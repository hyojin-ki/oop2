package oop11;

/*
 * 	이름					반복여부확인					데이터꺼내기
 *	Iterator			boolean hasNext()			E next()
 *	Enumeration			boolean hasMoreElements	 	E nextElements()
 *	StringTokenizer		boolean hasMoreTokens		String nextToken()
 *	ResultSet			boolean	next()				
 */


public class HTAListDemo {

	public static void main(String[] args) {
		
		HTAList list = new HTAList();
		
		//값 저장
		list.add("홍길동");
		list.add("강감찬");
		list.add("김유신");
		list.add("류관순");
		list.add("이순신");
		
		//값 반환
		HTAIterator it = list.iterator();
		
		while(it.hasNext()) {
			String value1 = it.next();		
			System.out.println("value: "+value1);
		}
		
		
		
	}
}
