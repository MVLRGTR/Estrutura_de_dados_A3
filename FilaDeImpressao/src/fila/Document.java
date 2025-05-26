package fila;

public class Document {
	
	private Document next;
	private String content;
	private Priority priority;
	
	public Document(String content,int priority) {
		this.content = content;
		this.priority = Priority.priorityInt(priority);
	}

	public String getContent() {
		return content;
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
