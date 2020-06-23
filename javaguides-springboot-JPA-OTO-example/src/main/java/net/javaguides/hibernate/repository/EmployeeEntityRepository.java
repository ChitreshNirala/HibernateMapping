package net.javaguides.hibernate.repository;

import java.awt.print.Book;
import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import net.javaguides.hibernate.entity.EmployeeEntity;

@Transactional
public interface EmployeeEntityRepository extends JpaRepository<EmployeeEntity, Integer>{

	 @EntityGraph(attributePaths = "bookCategory")
	    List<Book> findFirst10ByOrderByNameAsc();

	    @Modifying
	    @Transactional
	    @Query("DELETE FROM Book b WHERE b.bookCategory.id = ?1")
	    void deleteInBulkByCategoryId(int categoryId);

	    @Transactional
	    void deleteByBookCategoryId(int categoryId);
}
