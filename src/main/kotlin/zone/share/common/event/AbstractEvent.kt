package zone.share.common.event

import zone.share.common.Identifiable

/**
 * AbstractEvent
 * @author Iamee
 * @create 2019-01-29 17:33
 */
abstract class AbstractEvent : Identifiable {

    lateinit var seq: String
        private set

    var time: Long = 0
        private set

    constructor()

    constructor(seq: String, time: Long) {
        this.seq = seq
        this.time = time
    }

}