package com.itchain.samplemsa.samplemsa;

import com.itchain.samplemsa.samplemsa.common.Event;
import lombok.*;
import org.springframework.lang.NonNull;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class SampleEvent implements Event {
    @NonNull
    private String ID;
    @Override
    public String getID() {
        return this.ID;
    }
}
