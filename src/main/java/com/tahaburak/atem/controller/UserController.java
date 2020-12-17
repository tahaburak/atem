package com.tahaburak.atem.controller;

import com.tahaburak.atem.model.User;
import com.tahaburak.atem.service.IUserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

/**
 * Created by burak on 25.11.2019
 */
@RestController
@RequestMapping("/user")
public class UserController {
  private final IUserService userService;

  public UserController(IUserService userService) {
    this.userService = userService;
  }

  @Operation(summary = "Get user by it id")
  @ApiResponses(
          value = {
                  @ApiResponse(
                          responseCode = "200",
                          description = "User information",
                          content = {
                                  @Content(
                                          mediaType = "application/json",
                                          schema = @Schema(implementation = User.class))
                          }),
                  @ApiResponse(responseCode = "400", description = "Invalid id", content = @Content),
                  @ApiResponse(responseCode = "404", description = "User not found", content = @Content)
          })
  @GetMapping(value = "/id/{id}")
  @ResponseBody
  public User getUserById(@Parameter(description = "id of user") @PathVariable Long id) {
    // TODO: 25.11.2019 going to implement security features later
    return userService.getUserById(id);
  }
}
