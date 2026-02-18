def successEmail() {
    emailext(
        to: 'shankarbhairappanavar@gmail.com',
        subject: "SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
        body: "Build succeeded. Check console: ${env.BUILD_URL}"
    )
}

def failureEmail() {
    emailext(
        to: 'shankarbhairappanavar@gmail.com',
        subject: "FAILED: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
        body: "Build failed. Check console: ${env.BUILD_URL}"
    )
}
