package com.pradeep.Service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pradeep.Model.Address;
import com.pradeep.Model.Player;
import com.pradeep.Services.PlayerService;

@SpringBootTest
public class ServiceTest {
	
	@Autowired
	private PlayerService pService;
	
	@Test
	void findWinnerHandler() {
		String winner = pService.findWinnerHandler("Rock");
		assertThat(winner).isEqualTo("Player wins"); //we cant predict the output because computer return the output we are not responsible for the same3
		
	
	}
	@Test
	void loginTester() {
		Player player = pService.login("prasingroul100@gmail.com");
		assertThat(player.getUserName()).isEqualTo("pradeep lodhi"); //we cant predict the output because computer return the output we are not responsible for the same3
		
	
	}
	@Test
	void registerTester() {
		Address ad = new Address(120, "pune", "MH", "487511");
		Player p = new Player("tester@gmail.com", "tester", "Pradeep Tester", ad);
		Player player = pService.registerUser(p);
		
		assertThat(player.getUserName()).isEqualTo("Pradeep Tester"); //we cant predict the output because computer return the output we are not responsible for the same3
		
	
	}

}
