package com.qiancheng.work1;
//Poem、名字、作者、朝代、内容
public class Poem {
	private String name;
	private String author;
	private String dynasty;
	private String content;
	public Poem() {
		super();
	}
	public Poem(String name, String author, String dynasty, String content) {
		super();
		this.name = name;
		this.author = author;
		this.dynasty = dynasty;
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDynasty() {
		return dynasty;
	}
	public void setDynasty(String dynasty) {
		this.dynasty = dynasty;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Poem [name=" + name + ", author=" + author + ", dynasty=" + dynasty + ", content=" + content + "]";
	}
	
	
}
