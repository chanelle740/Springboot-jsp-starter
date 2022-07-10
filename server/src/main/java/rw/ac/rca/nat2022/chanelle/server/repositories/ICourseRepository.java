package rw.ac.rca.nat2022.chanelle.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.ac.rca.nat2022.chanelle.server.models.Course;

@Repository
public interface ICourseRepository extends JpaRepository<Course, Long> {

}
