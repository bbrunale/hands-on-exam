2	package project;
3	
4	import org.springframework.data.jpa.repository.JpaRepository;
5	
6	interface UserRepository extends JpaRepository<User, Long> {}
