package org.example.expert.domain.user.enums;

import lombok.Getter;
import org.example.expert.domain.common.exception.InvalidRequestException;

import java.util.Arrays;

@Getter
public enum UserRole {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");

    private final String roleName;

    UserRole(String roleName) {
        this.roleName = roleName;
    }

    public static UserRole of(String role) {
        // ROLE_이 붙은 값이든, 그냥 ADMIN이든 다 처리 가능
        return Arrays.stream(UserRole.values())
                .filter(r -> r.name().equalsIgnoreCase(role) || r.roleName.equalsIgnoreCase(role))
                .findFirst()
                .orElseThrow(() -> new InvalidRequestException("유효하지 않은 UerRole"));
    }
}
