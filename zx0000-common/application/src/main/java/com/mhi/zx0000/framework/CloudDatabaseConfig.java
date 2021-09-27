package com.mhi.zx0000.framework;

import javax.annotation.Resource;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.sql.DataSource;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
// import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class CloudDatabaseConfig extends AbstractCloudConfig {
	
	// @Bean
	// public DataSource dataSource(@Value("${hana.url}")final String url,
	// 		@Value("${hana.user}")final String user,
	// 		@Value("${hana.password}")final String password) {
		
		
	// 	return DataSourceBuilder.create()
	// 			.type(HikariDataSource.class)
	// 			.driverClassName(com.sap.db.jdbc.Driver.class.getName())
	// 			.url(url)
	// 			.username(user)
	// 			.password(password)
	// 			.build();	

    // }

    // @Bean
	// public DataSource dataSource() {

	// 	DataSource ds = DataSourceBuilder.create()
	// 			.type(HikariDataSource.class)
	// 			.driverClassName(com.sap.db.jdbc.Driver.class.getName())
	// 			.url("https://af95b1e0-f25a-40db-87f0-8fce4108dc82.hana.trial-us10.hanacloud.ondemand.com/?encrypt=true")
	// 			.username("TEST_USER")
	// 			.password("Test0000")
	// 			.build();	
		
	// 	return ds;

    // }

    
    // @Resource(name = "jdbc/DefaultDB")
    // private DataSource ds ;

    @Bean
    public DataSource dataSource() {
        DataSource ds;
        try{
            
            InitialContext context = new InitialContext();
            ds =  (DataSource)context.lookup("java:comp/env/jdbc/DefaultDB");
        }catch(NamingException e){
            ds = null;
        }

		return ds;
	}
}