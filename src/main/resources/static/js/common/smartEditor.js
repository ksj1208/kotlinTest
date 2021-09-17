const smartEditor = {

    oEditors: [],

    init: (target) => {
        smartEditor.createFrame(target)
        smartEditor.bind()
    },

    bind: () => {

    },

    createFrame: (target) => {
        nhn.husky.EZCreator.createInIFrame({
            oAppRef: smartEditor.oEditors,
            elPlaceHolder: target,
            sSkinURI: "/smartEditor/SmartEditor2Skin.html",
            htParams: {
                // 툴바 사용 여부 (true:사용/ false:사용하지 않음)
                bUseToolbar: true,
                // 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
                bUseVerticalResizer: true,
                // 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
                bUseModeChanger: true,
                fOnBeforeUnload: function () {

                }
            },
            fCreator: "createSEditor2"
        })
    },

    updateContent: (target) => {
        smartEditor.oEditors.getById[target].exec("UPDATE_CONTENTS_FIELD", []);
    }

}