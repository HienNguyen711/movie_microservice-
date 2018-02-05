package movie.userservice.repository;
import javax.transaction.Transactional;

import movie.userservice.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("usersRepository")
@Transactional
public interface UserRepository extends CrudRepository<User, Integer> {

    public User getByUserName(String userName);

    public User findUserByUserName(String userName);

    public List<User> findAll();

    public User findById(Integer id);


}