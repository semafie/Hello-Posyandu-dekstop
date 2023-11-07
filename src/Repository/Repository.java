
package Repository;

import java.sql.Connection;
import java.util.List;

public interface Repository<E extends entity.Entity>  {
        final Connection conn = util.Conn.getConnection();
        
        public List<E> get();
        
        public E get(Integer id);
        
        public boolean add(E entity);
        
        public boolean update(E entity);
        
        public boolean delete(int id);
}
