package login.config;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//https://www.baeldung.com/the-persistence-layer-with-spring-and-jpa
//le decimos a spring que esta clase va a contener @Bean
@Configuration
//Le decimos a spring que vamso a trabajar con un repositorio
//jpa que esta en el sigiente paquete
@EnableJpaRepositories(basePackages= {"login.modelo.persistencia"})
@EnableTransactionManagement
public class Configuracion {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/jpa?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean 
		entityManagerFactory(DataSource dataSource, Environment env) {
		
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = 
			new LocalContainerEntityManagerFactoryBean();
		
		entityManagerFactoryBean.setDataSource(dataSource);
		entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		// para que cree la tabla hay que darle la ruta de donde sacarla
		entityManagerFactoryBean.setPackagesToScan("login.modelo.entidad");
		
		Properties jpaProperties = new Properties();
		//OJO - CAMBIAR EL DIALECTO DE LOS EJERCICIOS DE FELIX// 
		//jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		//org.hibernate.dialect.MySQL8Dialect
		jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		jpaProperties.put("hibernate.hbm2ddl.auto", "update");//create-drop update
		jpaProperties.put("hibernate.show_sql", "true");
		jpaProperties.put("hibernate.format_sql", "false");
		entityManagerFactoryBean.setJpaProperties(jpaProperties);

		return entityManagerFactoryBean;
	}
	
	@Bean
	JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}
	
}
