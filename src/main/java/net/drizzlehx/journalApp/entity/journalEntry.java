package net.drizzlehx.journalApp.entity;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "journal_entries")
public class journalEntry
{
    @Getter
    @Setter
    @Id
    private ObjectId id;
    private String title;
    private Date date;
    private String content;

}
