package com.spring.sample.java.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * DBアクセス用リポジトリ。
 * 何も実装しなくても、Spring Data JPA が標準で提供するメソッドが自動生成される。
 */
@Repository
public interface MinOrdersRepository extends JpaRepository<MinOrders, Long> { // エンティティと主キーの型を指定

}

