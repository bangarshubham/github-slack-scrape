
package org.appops.slack;

import com.slack.api.Slack;
import com.slack.api.SlackConfig;
import com.slack.api.bolt.App;
import com.slack.api.bolt.AppConfig;
import com.slack.api.methods.MethodsClient;
import com.slack.api.methods.SlackApiException;
import com.slack.api.methods.request.chat.ChatPostMessageRequest;
import com.slack.api.methods.request.conversations.ConversationsListRequest;
import com.slack.api.methods.request.users.UsersListRequest;
import com.slack.api.methods.request.users.profile.UsersProfileGetRequest;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;
import com.slack.api.methods.response.conversations.ConversationsListResponse;
import com.slack.api.methods.response.users.UsersListResponse;
import com.slack.api.methods.response.users.profile.UsersProfileGetResponse;
import com.slack.api.model.block.DividerBlock;
import com.slack.api.model.block.LayoutBlock;
import com.slack.api.model.block.SectionBlock;
import com.slack.api.model.block.composition.MarkdownTextObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlackUserInfo {

  private static MethodsClient methodsClient;

  public static void main(String[] args) throws Exception {

    SlackConfig config = new SlackConfig();
    Slack slack = Slack.getInstance(config);

    AppConfig appConfig = new AppConfig();
    App app = new App(appConfig);

    //////////////////////////////////// Slack App Info ////////////////////////////////
    UsersProfileGetRequest userProfieReq = UsersProfileGetRequest.builder()
        .token("xoxb-2580368213092-2605960589152-8Lv6XG3R32z5wDae2iSNZoLd").build();

    UsersProfileGetResponse userProfileResponse = app.client().usersProfileGet(userProfieReq);
    System.out.println(userProfileResponse);
    ////////////////////////////////////////////////////////////////////////////////////

    UsersListRequest userListRequest = UsersListRequest.builder()
        .token("xoxb-2580368213092-2605960589152-8Lv6XG3R32z5wDae2iSNZoLd").build();

    UsersListResponse usersListResponse = app.client().usersList(userListRequest);
    System.out.println(userListRequest);

    //////////////////////////////////////////////////////////////////////////////////////////

    methodsClient = slack.methods("xoxb-2580368213092-2605960589152-8Lv6XG3R32z5wDae2iSNZoLd");

    ConversationsListRequest converListReq = ConversationsListRequest.builder()
        .token("xoxb-2580368213092-2605960589152-8Lv6XG3R32z5wDae2iSNZoLd").build();

    ConversationsListResponse conversationsListResponse =
        methodsClient.conversationsList(converListReq);

    System.out.println(conversationsListResponse);

    UsersListRequest userListRequest2 = UsersListRequest.builder()
        .token("xoxb-2580368213092-2605960589152-8Lv6XG3R32z5wDae2iSNZoLd").build();

    UsersListResponse usersListResponse2 = methodsClient.usersList(userListRequest2);

    System.out.println(usersListResponse2);



    // sendMessages("Shubham Bangar", "Ainosoft", "Burger", true, false, true);

  }

  public static void sendMessages(String coworker, String department, String foodItem,
      Boolean isVegan, Boolean isHot, Boolean isContainerReturnable) {
    String isVeganString = "";
    String isHotString = "";
    String isContainerReturnableString = "";
    if (isVegan) {
      isVeganString = "Yes";
    } else {
      isVeganString = "No";
    }
    if (isHot) {
      isHotString = "Hot";
    } else {
      isHotString = "Cold";
    }
    if (isContainerReturnable) {
      isContainerReturnableString = "Yes";
    } else {
      isContainerReturnableString = "No";
    }
    List<LayoutBlock> message = new ArrayList();
    message.add(SectionBlock.builder().text(MarkdownTextObject.builder()
        .text("*A co-worker signed up for the office potluck!*").build()).build());
    message.add(SectionBlock.builder()
        .fields(
            Arrays.asList(MarkdownTextObject.builder().text("*CO-WORKER:* " + coworker).build(),
                MarkdownTextObject.builder().text("*DEPARTMENT:* " + department).build(),
                MarkdownTextObject.builder().text("*FOOD ITEM:* " + foodItem).build(),
                MarkdownTextObject.builder().text("*VEGAN?:* " + isVeganString).build(),
                MarkdownTextObject.builder().text("*HOT OR COLD?:* " + isHotString).build(),
                MarkdownTextObject.builder()
                    .text("*RETURN THE CONTAINER?:* " + isContainerReturnableString).build()))
        .build());
    message.add(DividerBlock.builder().build());
    ChatPostMessageRequest request =
        ChatPostMessageRequest.builder().channel("C02H059QG9Y").blocks(message).build();

    sendMessage(request);

  }



  private static void sendMessage(ChatPostMessageRequest request) {
    try {
      // Get a response as a Java object
      ChatPostMessageResponse response = methodsClient.chatPostMessage(request);
      response.getChannel();
    } catch (IOException e) {
      // do something with exception
    } catch (SlackApiException e) {
      // do something with exception
    }
  }
}
