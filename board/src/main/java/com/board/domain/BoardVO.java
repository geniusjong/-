package com.board.domain;

import java.util.Date;

public class BoardVO {
	
	//마리아 DB에서 만든 테이블
/* 
 * create table tbl_board(
  bno int not null auto_increment,
  title varchar(50) not null,
  content text not null,
  writer varchar(30) not null,
  regDate timestamp not null default now(),
  viewCnt int default 0,
  primary key(bno)
);
 * 
 */
	// DB에서 만든 테이블 컬럼과 동일한 명칭과 데이터형으로 변수를 만들어준다.
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private int viewCnt;
	
	//스프링 상단 메뉴에서 Source -> Generate Getters and Setters를 선택한후 Select All로 생성해줌
	//getter와 setter가 있어야 Vo의 데이터를 사용할수 있으므로 이 작업은 필수
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	
	
}
