const boardWrite = {

    init: () => {
        smartEditor.init()
        boardWrite.bind()
    },

    bind: () => {
        document.getElementById('saveBtn').addEventListener('click', boardWrite.save)
    },

    save: () => {
        boardWrite.createRequest()
    },

    createRequest: () => {
        smartEditor.updateContent('content')
        const content = document.getElementById('content').value
        console.log(content)
    }
}

boardWrite.init()