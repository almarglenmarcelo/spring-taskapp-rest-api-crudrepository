package todo.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name="TODO")
//@DynamicInsert
public class Todo{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="todo_id")
	private int id;
	
	@Column(name="task")
	private String task;
	
	
	@Column(name="description")
	private String description;


	// No args constructor
	public Todo() {}
	
	public Todo(int id, String task, String description) {
		this.id = id;
		this.task = task;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", task=" + task + ", description=" + description + "]";
	}
	
	
	
	
	
	
}
