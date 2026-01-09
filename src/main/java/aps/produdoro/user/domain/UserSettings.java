package aps.produdoro.user.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Builder(access = AccessLevel.PACKAGE)
@Getter
public class UserSettings {
    private Integer focusTimeMinutes;
    private Integer shortBreakTimeMinutes;
    private Integer longBreakTimeMinutes;
    private Integer roundsBeforeLongBreak;
}
