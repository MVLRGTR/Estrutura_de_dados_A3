package fila;

public class Document {
	
	private Document next;
	private String content;
	private String title;
	private Priority priority;
	private int insertPosition;
	
	public Document(String content,String title,int priority) throws WaitingLineException {
		if(content == "" || title == "" ) {
			throw WaitingLineException.documentVariablesErro("O documento não pode ter titulo ou conteudo vazio !!!");
		}
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

	public int getInsertPosition() {
		return insertPosition;
	}

	public void setInsertPosition(int insertPosition) {
		this.insertPosition = insertPosition;
	}
	
	
}
