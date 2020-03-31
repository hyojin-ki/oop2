package oop4;

public class Reporter {

	String[] data;
	//DataOutput output = new DataOutput();
//	DataOutput output = new ConsoleDataOutput();
//	DataOutput outputter = new FileDataOutput("C:/files","data.txt");
	DataOutput outputter;

	//DataOutput류 객체를 전달받아서 멤버변수 outputter에 담는 메소드
	void setOutputter(DataOutput dataOutput) {
		this.outputter = dataOutput;
	}
	
	void setData(String[] data) {
		this.data = data;
	}
	
	void reporting() {
		outputter.output(data);
	}

	//메소드 재정의안하면 아래와 같은 형변환 노가다를 해야함
//	void reporting() {
//		if(outputter instanceof FileDataOutput) {
//			((FileDataOutput) outputter).output(data);
//		}else if(outputter instanceof ConsoleDataOutput) {
//			((ConsoleDataOutput) outputter).output(data);
//		} //
//	}
}
