package ject.petfit.domain.user.dto;

import lombok.Getter;


public class KakaoDto {

    @Getter
    public static class OAuthToken {
        private String access_token;
        private String token_type;
        private String refresh_token;
        private int expires_in;
        private String scope;
        private int refresh_token_expires_in;
    }

    @Getter
    public static class KakaoProfile {
        private Long id;
        private String connected_at;
        private KakaoAccount kakao_account;

        @Getter
        public class KakaoAccount {
            private Profile profile;
            private String email;
            private Boolean is_email_verified;
            private Boolean has_email;
            private Boolean profile_nickname_needs_agreement;
            private Boolean email_needs_agreement;
            private Boolean is_email_valid;

            @Getter
            public class Profile {
                private String nickname;
            }
        }
    }
}
