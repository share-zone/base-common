package zone.share.common

import zone.share.common.exception.AbstractException

/**
 * CommandResult
 * @author Iamee
 * @create 2019-01-29 17:40
 */
class CommandResult {

    var exception: AbstractException? = null

    var succeed: Boolean = true

    constructor()

    constructor(exception: AbstractException) {
        this.exception = exception
        this.succeed = false
    }

    companion object {
        fun successful(): CommandResult {
            return CommandResult()
        }

        fun unsuccessful(exception: AbstractException): CommandResult {
            return CommandResult(exception = exception)
        }
    }

}