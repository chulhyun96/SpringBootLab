package springboot.account;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
//슬라이싱 테스트 리포지토리와 관련된 빈만을 주입받아서 테스트 하는게 슬라이싱 테스트
@DataJpaTest
public class AccountRepositoryTest {
    // 아래 주입 받는 JpaRepository를 구현하면 주입 되는 것들
    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    AccountRepository accountRepository;

    @Test
    public void di() {
        Account account = new Account();
        account.setUsername("Pack");
        account.setPassword("paas");

        Account newAccount = accountRepository.save(account);
        Assertions.assertThat(newAccount).isNotNull();


        Account accountFound = accountRepository.findByUsernmae("Pack");
        Assertions.assertThat(accountFound).isEqualTo(newAccount);
    }
}