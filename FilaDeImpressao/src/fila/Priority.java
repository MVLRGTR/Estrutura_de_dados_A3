package fila;

import fila.Priority;

public enum Priority {
	
	URGENT(1),
	HIGH(2),
	NORMAL(3),
	LOW(4),
	VERYLOW(5);
	
	private int  priority;
	
	Priority(int priority) {
		this.priority = priority;
	}

	public int getPriorityInt() {
		return priority;
	}
	
	public static Priority priorityInt(int priority) {
		for(Priority p : Priority.values()) {
			if(p.getPriorityInt()==priority) {
				return p;
			}
		}
		throw new IllegalArgumentException("Prioridade Inválida : "+priority);
	}
	
}
