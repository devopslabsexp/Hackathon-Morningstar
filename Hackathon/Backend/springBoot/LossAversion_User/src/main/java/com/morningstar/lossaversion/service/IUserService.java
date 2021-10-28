package com.morningstar.lossaversion.service;

import com.morningstar.lossaversion.dto.LoginDto;
import com.morningstar.lossaversion.dto.UpdatePasswordDto;
import com.morningstar.lossaversion.dto.UserDto;
import com.morningstar.lossaversion.entity.User;

public interface IUserService {
	public User register(UserDto userDto);
	public String login(LoginDto loginDto);
	public User givingUser(String token);
	public void verifyEmail(String token);
	public void forgotPassword(String email);
	public void resetPassword(String newPassword, String token);
	public void updatePassword(String token, UpdatePasswordDto updatePasswordDto);
}
