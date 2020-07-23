package enset.bdcc.jee.cinema.dao;

import enset.bdcc.jee.cinema.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin("*")
@RepositoryRestResource
public interface UserRepository extends JpaRepository<User,Long> {
        @RestResource(path = "/byEmail")
    public User getByEmailEquals(@Param("email") String email);
}
