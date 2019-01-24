package com.telkomdev.kotlinmvp.utils.common

object Constants {
    internal val APP_DB_NAME = "CODEBASE_KOTLIN.db"
    internal val PREF_NAME = "CODEBASE_PREF"
    internal val NULL_INDEX = -1L

    //ERROR CODE
    internal val EMPTY_EMAIL_ERROR = 1001
    internal val INVALID_EMAIL_ERROR = 1002
    internal val EMPTY_PASSWORD_ERROR = 1003
    internal val LOGIN_FAILURE = 1004

    enum class LoggedInMode constructor(val type: Int) {
        LOGGED_IN_MODE_LOGGED_OUT(0),
        LOGGED_IN_MODE_SERVER(1),
        LOGGED_IN_MODE_GOOGLE(2),
        LOGGED_IN_MODE_FB(3)
    }
}