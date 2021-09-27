package com.spring.sample.java.Repository;
    import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data // Lombok でゲッターセッターなど便利なメソッド等を自動生成
@Entity // JPA エンティティとして扱う
@Table(name = "MINORDERS") // DBテーブル情報
public class MinOrders {

    @Id // JPA にこの変数をオブジェクトのIDだと認識させる
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID自動生成
    @Column(name = "ORDERID", nullable = false) // DBテーブルのカラム情報
    @JsonProperty("ORDERID") // マッピングする JSON キー (名前)
    private int orderid;

    @Column(name = "PRODUCTID", nullable = true)
    @JsonProperty("PRODUCTID")
    private int productid;

    @Column(name = "CUSTOMERID", nullable = true)
    @JsonProperty("CUSTOMERID")
    private int costomerid;

    @Column(name = "GROSSSALES", nullable = true)
    @JsonProperty("GROSSSALES")
    private long grosssales;
}
