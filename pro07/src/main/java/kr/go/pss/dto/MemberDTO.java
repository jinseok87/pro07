package kr.go.pss.dto;

import lombok.Data;

@Data
public class MemberDTO {
	private String id;
	private String pw;
	private String name;
	private String address;
	private String email;
	private String tel;
	private String regdate;
}
