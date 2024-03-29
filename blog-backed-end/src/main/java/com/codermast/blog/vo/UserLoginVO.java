package com.codermast.blog.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class UserLoginVO implements Serializable {
    @TableId
    private Long uid;

    private String username;

    private String email;

    // jwt 令牌
    private String token;
}
