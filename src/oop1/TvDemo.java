package oop1;

public class TvDemo {
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		
		tv.power();
		tv.channelDown();
		tv.channelUp();
		
		IPTv iptv = new IPTv();
		iptv.power();									//tv
		iptv.channelDown();								//tv
		iptv.channelUp();								//tv
		iptv.ip = "143.56.78.123";
		iptv.internet("www.daum.net");					//IpTv
			
		CaptionTv captionTv = new CaptionTv();
		captionTv.power();
		captionTv.channelDown();
		captionTv.channelUp();
		captionTv.caption = true;
		captionTv.displayCaption("시각장애우를 위한 자막을 표시합니다.");
		
		NetflixTv netflixTv = new NetflixTv();
		netflixTv.power();								//tv
		netflixTv.channelDown();						//tv
		netflixTv.channelUp();							//tv
		netflixTv.ip ="211.167.24.123";
		netflixTv.internet("www.naver.com");			//IpTv
		netflixTv.membership = "standard";
		netflixTv.watchMovie("트루먼쇼");					//netflixTv
		
		
		
		
	}
}
