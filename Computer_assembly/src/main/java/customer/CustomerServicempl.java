package customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired private CustomDAO dao;

    @Override
    public void customer_insert(CustomerVO vo) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<CustomerVO> customer_list() {
        return dao.customer_list();
    }

    @Override
    public CustomerVO customer_detail(int id) {
        return dao.customer_detail(id);
    }

    @Override
    public void customer_update(CustomerVO vo) {
        // TODO Auto-generated method stub

    }

    @Override
    public void customer_delete(int id) {
        // TODO Auto-generated method stub

    }

}
