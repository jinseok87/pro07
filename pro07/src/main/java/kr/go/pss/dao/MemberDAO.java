package kr.go.pss.dao;

import java.util.List;

import kr.go.pss.dto.MemberDTO;

public interface MemberDAO {
//	ȸ�����
public List<MemberDTO> memberList() throws Exception;
//ȸ������
public MemberDTO memberDetail(String id) throws Exception;
//ȸ��Ż��
public void memberDelete(String id) throws Exception;
//ȸ���߰�
public void memberInsert(MemberDTO dto) throws Exception;
//ȸ����������
public void memberEdit(MemberDTO dto) throws Exception;
//��Ʈ�ѷ� �α���ó��
public MemberDTO login(MemberDTO dto) throws Exception;
//�α��� DAO���� ó��
public MemberDTO loginCheck(MemberDTO dto) throws Exception;
//Ajax�α���
public MemberDTO ajaxLogin(MemberDTO dto) throws Exception;
}
