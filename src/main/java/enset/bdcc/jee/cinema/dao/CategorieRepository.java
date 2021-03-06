package enset.bdcc.jee.cinema.dao;

import enset.bdcc.jee.cinema.entities.Categorie;
import enset.bdcc.jee.cinema.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
