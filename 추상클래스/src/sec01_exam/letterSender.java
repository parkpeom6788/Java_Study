package sec01_exam;

public class letterSender extends  ContentSender {
	String content;
	public letterSender(String title,String nm,String content) {
		super(title,nm);
		this.content = content;
	}
	public void sendMsg(String recipient) {
		System.out.println("제목=" + this.title);
		System.out.println("이름=" + this.nm);
		System.out.println("내용=" + this.content);
		System.out.println("받는 사람=" + recipient);
	}
}
