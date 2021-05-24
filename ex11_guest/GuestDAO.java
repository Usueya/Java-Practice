package ex11_guest;

import java.util.List;

public interface GuestDAO {
	//삽입(건수 반환)
	int insert(GuestDTO gdto);
	//수정(건수 반환)
	int update(GuestDTO gdto);
	//삭제(건수 반환)
	int delete(int seq);
	//한건조회(pk매개변수)
	GuestDTO selectOne(int seq);
	//전체조회
	List<GuestDTO> selectList();
}
