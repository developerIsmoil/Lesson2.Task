package com.projection;

import com.entity.AttachmentContent;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {
    Long getId();

    byte[] getBytes();
}
