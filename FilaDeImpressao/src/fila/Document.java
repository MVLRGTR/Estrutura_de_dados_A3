package fila;

public class Document {
	
	private Document next;
	private String content;
	private String title;
	private Priority priority;
	
	public Document(String content,String title,int priority) {
		this.content = content;
		this.priority = Priority.priorityInt(priority);
		this.title = title;
	}

	public String getContent() {
		return content;
	}
	
	public String getTitle() {
		return title; 
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Document getNext() {
		return next;
	}

	public void setNext(Document next) {
		this.next = next;
	}

	public Priority getPriority() {
		return priority;
	}

}
