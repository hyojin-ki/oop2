package oop11;

public class HTAList {
	
	private String[] data = new String[100];
	private int position = 0;
	
	public void add(String value) {
		data[position] = value;
		position++;
	}

	//내부 클래스에 대한 객체 반환
	public HTAIterator iterator() {
		HTAListIterator iter = new HTAListIterator();
		return iter;
	}
	
	//HTAList에 저장된 데이터 꺼내기 기능이 구현된 HTAListIterator 클래싀.
	class HTAListIterator implements HTAIterator{
		
		private int currentPosition = 0;
		
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			
			boolean hasValue = true;
			
			if(currentPosition == position) {			//멤버변수  position 사용
				hasValue = false;
			}
			
			return hasValue;
		}
		
		@Override
		public String next() {
			// TODO Auto-generated method stub
			String value = data[currentPosition];		//멤버변수 data 사용
			currentPosition++;
			return value;
				
		}
		
		
	}

}
