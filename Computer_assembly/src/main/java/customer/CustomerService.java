package customer;

import java.util.List;

public interface CustomerService {

    void customer_insert(CustomerVO vo);

    //목록 조회
    List<CustomerVO> customer_list();

    //상세(1건) 조회
    CustomerVO customer_detail(int id);

    //고객 정보 변경 저장
    void customer_update(CustomerVO vo);

    //고객 정보 삭제
    void customer_delete(int id);
}