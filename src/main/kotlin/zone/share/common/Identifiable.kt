package zone.share.common

import com.fasterxml.jackson.annotation.JsonIgnore
import org.axonframework.commandhandling.TargetAggregateIdentifier

/**
 * Identifiable
 * @author Iamee
 * @create 2019-01-29 17:31
 */
interface Identifiable {

    @JsonIgnore
    @TargetAggregateIdentifier
    fun getIdentifier(): String

}