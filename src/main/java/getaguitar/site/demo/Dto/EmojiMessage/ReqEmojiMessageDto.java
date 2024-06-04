package getaguitar.site.demo.Dto.EmojiMessage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReqEmojiMessageDto {
    private String room;
    private String text;
    private String username;
}
