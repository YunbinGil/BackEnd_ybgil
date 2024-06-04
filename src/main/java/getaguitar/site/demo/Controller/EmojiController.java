package getaguitar.site.demo.Controller;

import getaguitar.site.demo.Dto.ChatMessage.ResChatMessageDto;
import getaguitar.site.demo.Dto.EmojiMessage.ReqEmojiMessageDto;
import getaguitar.site.demo.Dto.EmojiMessage.ResEmojiMessageDto;
import getaguitar.site.demo.Entity.ChatEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmojiController {

    @MessageMapping("/emoji")
    @SendTo("/topic/emoji")
    public ResEmojiMessageDto sendMessage(@Payload ReqEmojiMessageDto message) {
        String text = message.getText();
        String username = message.getUsername();

        return new ResEmojiMessageDto(text,username);
    }
}
