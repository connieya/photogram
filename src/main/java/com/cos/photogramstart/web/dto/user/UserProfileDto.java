package com.cos.photogramstart.web.dto.user;

import com.cos.photogramstart.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserProfileDto {
    private boolean pageOwner;
    private int imageCount;
    private boolean subscribeState;
    private int subscribeCount;
    private int subscribedCount;
    private User user;
}
