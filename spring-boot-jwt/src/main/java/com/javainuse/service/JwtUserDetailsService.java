package com.javainuse.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("test1".equals(username)) {
			return new User("test1", "$2a$12$tigNxJAtt/PtVx9/OPSb7OB/Tj1UZveALUN45YA/QWFVQKL3Q4vie",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
	public List<Integer> getList(){

		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(2);
		return integers;
	}

}