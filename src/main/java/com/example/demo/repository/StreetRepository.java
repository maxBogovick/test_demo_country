package com.example.demo.repository;

        import com.example.demo.model.StreetEntity;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.data.repository.query.Param;
        import org.springframework.stereotype.Repository;

        import java.util.Collection;
        import java.util.List;
        import java.util.Optional;

@Repository
public interface StreetRepository extends JpaRepository<StreetEntity, Integer> {
    Optional<StreetEntity> findByHouse(Integer number);

    //HQL
    @Query("select h from StreetEntity h where h.house between :first and :second")
    Collection<StreetEntity> getAllByFilter(@Param("first")int first, @Param("second") int second);

    //SQL
    @Query(value = "select * from street h where h.house between :param1 and :param2", nativeQuery = true)
    Collection<StreetEntity> getAllByFilter2(@Param("param1")int first, @Param("param2") int second);

    //Spring data jpa
    Collection<StreetEntity> findAllByHouseBetweenAndCityIdIsNotNull(int first, int second);
}

